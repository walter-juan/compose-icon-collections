package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.ChalkboardUser: ImageVector
    get() {
        if (_chalkboardUser != null) {
            return _chalkboardUser!!
        }
        _chalkboardUser = Builder(name = "ChalkboardUser", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 384.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                lineToRelative(96.0f, 0.0f)
                close()
                moveTo(544.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 33.1f, -25.2f, 60.4f, -57.5f, 63.7f)
                lineToRelative(-6.5f, 0.3f)
                lineToRelative(-211.1f, 0.0f)
                curveToRelative(-5.1f, -24.2f, -16.3f, -46.1f, -32.1f, -64.0f)
                lineToRelative(51.2f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(0.0f, -288.0f)
                lineToRelative(-352.0f, 0.0f)
                lineToRelative(0.0f, 57.3f)
                curveToRelative(-14.8f, -6.0f, -31.0f, -9.3f, -48.0f, -9.3f)
                curveToRelative(-5.4f, 0.0f, -10.8f, 0.3f, -16.0f, 1.0f)
                lineToRelative(0.0f, -49.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(352.0f, 0.0f)
                close()
                moveTo(144.0f, 352.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                close()
            }
        }
        .build()
        return _chalkboardUser!!
    }

private var _chalkboardUser: ImageVector? = null
