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

public val SolidGroup.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = Builder(name = "Print", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                curveTo(64.0f, 28.7f, 92.7f, 0.0f, 128.0f, 0.0f)
                lineTo(341.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(42.5f, 42.5f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineToRelative(0.0f, 37.5f)
                lineToRelative(-384.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                close()
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(128.0f, 416.0f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(256.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(-256.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                close()
                moveTo(456.0f, 272.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _print!!
    }

private var _print: ImageVector? = null
