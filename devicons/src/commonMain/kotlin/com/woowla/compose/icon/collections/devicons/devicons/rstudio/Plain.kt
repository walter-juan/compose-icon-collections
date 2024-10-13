package com.woowla.compose.icon.collections.devicons.devicons.rstudio

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.RstudioGroup

public val RstudioGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF75aadb)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.4f, 38.8f)
                curveToRelative(-1.5f, -0.6f, -3.9f, -1.0f, -6.9f, -1.1f)
                curveToRelative(-4.2f, -0.1f, -9.0f, 0.4f, -9.2f, 0.5f)
                verticalLineToRelative(20.0f)
                curveToRelative(13.3f, 0.6f, 15.5f, -1.7f, 15.5f, -1.7f)
                curveToRelative(11.6f, -5.9f, 4.3f, -16.2f, 0.6f, -17.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF75aadb)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.6f, 0.0f, 0.0f, 28.6f, 0.0f, 64.0f)
                reflectiveCurveToRelative(28.6f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.6f, 64.0f, -64.0f)
                reflectiveCurveTo(99.3f, 0.0f, 64.0f, 0.0f)
                close()
                moveTo(92.6f, 89.8f)
                lineTo(82.0f, 89.8f)
                lineTo(64.4f, 63.5f)
                horizontalLineToRelative(-9.0f)
                lineTo(55.4f, 84.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.8f)
                lineTo(41.5f, 89.8f)
                verticalLineToRelative(-5.7f)
                lineToRelative(7.6f, -0.1f)
                lineToRelative(-0.1f, -45.9f)
                curveToRelative(-0.8f, -0.2f, -7.5f, -0.8f, -7.5f, -0.8f)
                lineTo(41.5f, 32.0f)
                curveToRelative(1.0f, 1.0f, 7.9f, 1.2f, 7.9f, 1.2f)
                curveToRelative(1.6f, 0.1f, 3.9f, 0.2f, 5.2f, -0.1f)
                curveToRelative(9.3f, -1.7f, 16.4f, -0.4f, 16.4f, -0.4f)
                curveToRelative(14.0f, 3.2f, 14.2f, 15.8f, 10.3f, 22.6f)
                curveToRelative(-3.5f, 5.8f, -10.3f, 7.2f, -10.3f, 7.2f)
                lineToRelative(14.4f, 21.8f)
                lineToRelative(7.2f, -0.1f)
                verticalLineToRelative(5.6f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
