package com.woowla.compose.icon.collections.devicons.devicons.googlecloud

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
import com.woowla.compose.icon.collections.devicons.devicons.GooglecloudGroup

public val GooglecloudGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF557ebf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.6f, 40.3f)
                horizontalLineToRelative(0.4f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(14.0f, -14.0f)
                verticalLineToRelative(-0.3f)
                curveToRelative(-11.8f, -10.4f, -28.1f, -14.0f, -43.2f, -9.5f)
                curveTo(36.5f, 20.8f, 24.9f, 32.8f, 20.7f, 48.0f)
                curveToRelative(0.2f, -0.1f, 0.5f, -0.2f, 0.8f, -0.2f)
                curveToRelative(5.2f, -3.4f, 11.4f, -5.4f, 17.9f, -5.4f)
                curveToRelative(2.2f, 0.0f, 4.3f, 0.2f, 6.4f, 0.6f)
                curveToRelative(0.1f, -0.1f, 0.2f, -0.1f, 0.3f, -0.1f)
                curveToRelative(9.0f, -9.9f, 24.2f, -11.1f, 34.6f, -2.6f)
                horizontalLineToRelative(-0.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF557ebf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.1f, 47.8f)
                curveToRelative(-2.3f, -8.5f, -7.1f, -16.2f, -13.8f, -22.1f)
                lineTo(80.0f, 39.9f)
                curveToRelative(6.0f, 4.9f, 9.5f, 12.3f, 9.3f, 20.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(16.9f, 0.0f, 16.9f, 25.2f, 0.0f, 25.2f)
                horizontalLineTo(63.9f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(0.1f, 0.2f)
                horizontalLineToRelative(25.4f)
                curveToRelative(14.6f, 0.1f, 27.5f, -9.3f, 31.8f, -23.1f)
                curveToRelative(4.3f, -13.8f, -1.0f, -28.8f, -13.0f, -36.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF557ebf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.0f, 107.9f)
                horizontalLineToRelative(26.3f)
                verticalLineTo(87.7f)
                horizontalLineTo(39.0f)
                curveToRelative(-1.9f, 0.0f, -3.7f, -0.4f, -5.4f, -1.1f)
                lineToRelative(-15.2f, 14.6f)
                verticalLineToRelative(0.2f)
                curveToRelative(6.0f, 4.3f, 13.2f, 6.6f, 20.7f, 6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF557ebf)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.2f, 41.9f)
                curveToRelative(-14.9f, 0.1f, -28.1f, 9.3f, -32.9f, 22.8f)
                curveToRelative(-4.8f, 13.6f, 0.0f, 28.5f, 11.8f, 37.3f)
                lineToRelative(15.6f, -14.9f)
                curveToRelative(-8.6f, -3.7f, -10.6f, -14.5f, -4.0f, -20.8f)
                curveToRelative(6.6f, -6.4f, 17.8f, -4.4f, 21.7f, 3.8f)
                lineTo(68.0f, 55.2f)
                curveTo(61.4f, 46.9f, 51.1f, 42.0f, 40.2f, 42.1f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
