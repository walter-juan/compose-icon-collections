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

public val SolidGroup.Paste: ImageVector
    get() {
        if (_paste != null) {
            return _paste!!
        }
        _paste = Builder(name = "Paste", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 0.0f)
                curveToRelative(-23.7f, 0.0f, -44.4f, 12.9f, -55.4f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                lineTo(0.0f, 400.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, -272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-56.6f, 0.0f)
                curveTo(204.4f, 12.9f, 183.7f, 0.0f, 160.0f, 0.0f)
                close()
                moveTo(272.0f, 128.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 272.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -220.1f)
                curveToRelative(0.0f, -12.7f, -5.1f, -24.9f, -14.1f, -33.9f)
                lineToRelative(-67.9f, -67.9f)
                curveToRelative(-9.0f, -9.0f, -21.2f, -14.1f, -33.9f, -14.1f)
                lineTo(320.0f, 128.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
                moveTo(160.0f, 40.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _paste!!
    }

private var _paste: ImageVector? = null
