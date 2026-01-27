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

public val SolidGroup.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.1f, 0.0f)
                curveToRelative(33.4f, 0.0f, 64.5f, 17.4f, 81.9f, 45.9f)
                curveToRelative(1.2f, 2.0f, 13.0f, 21.3f, 35.3f, 57.8f)
                curveToRelative(21.1f, 34.5f, 18.3f, 78.5f, -7.0f, 110.0f)
                lineTo(278.3f, 297.7f)
                lineTo(364.5f, 406.0f)
                curveToRelative(5.5f, 6.9f, 4.4f, 16.9f, -2.5f, 22.5f)
                lineToRelative(-80.0f, 64.0f)
                curveToRelative(-6.9f, 5.5f, -17.0f, 4.4f, -22.5f, -2.5f)
                lineTo(38.6f, 213.8f)
                curveTo(13.3f, 182.3f, 10.5f, 138.3f, 31.6f, 103.8f)
                curveTo(54.0f, 67.2f, 65.7f, 47.9f, 67.0f, 45.9f)
                curveTo(84.4f, 17.4f, 115.4f, 0.0f, 148.9f, 0.0f)
                lineToRelative(86.3f, 0.0f)
                close()
                moveTo(192.0f, 189.2f)
                lineToRelative(48.6f, -61.2f)
                lineToRelative(-97.3f, 0.0f)
                lineToRelative(48.6f, 61.2f)
                close()
                moveTo(75.0f, 336.2f)
                lineToRelative(86.2f, 107.8f)
                lineToRelative(-36.8f, 46.0f)
                curveToRelative(-5.5f, 6.9f, -15.6f, 8.0f, -22.5f, 2.5f)
                lineToRelative(-80.0f, -64.0f)
                curveToRelative(-6.9f, -5.5f, -8.0f, -15.6f, -2.5f, -22.5f)
                lineTo(75.0f, 336.2f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
