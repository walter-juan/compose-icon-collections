package com.woowla.compose.icon.collections.devicons.devicons.trpc

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
import com.woowla.compose.icon.collections.devicons.devicons.TrpcGroup

public val TrpcGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF398ccb)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 38.0f)
                curveTo(0.0f, 17.0f, 17.0f, 0.0f, 38.0f, 0.0f)
                horizontalLineToRelative(52.0f)
                curveToRelative(21.0f, 0.0f, 38.0f, 17.0f, 38.0f, 38.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(0.0f, 21.0f, -17.0f, 38.0f, -38.0f, 38.0f)
                horizontalLineTo(38.0f)
                curveToRelative(-21.0f, 0.0f, -38.0f, -17.0f, -38.0f, -38.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.9f, 18.8f)
                lineTo(81.6f, 29.0f)
                verticalLineToRelative(5.6f)
                lineToRelative(21.5f, 12.5f)
                verticalLineToRelative(21.2f)
                lineToRelative(5.8f, 3.3f)
                verticalLineToRelative(20.6f)
                lineToRelative(-17.7f, 10.2f)
                lineToRelative(-7.9f, -4.6f)
                lineToRelative(-19.2f, 11.1f)
                lineToRelative(-19.1f, -11.0f)
                lineToRelative(-7.7f, 4.5f)
                lineToRelative(-17.8f, -10.3f)
                lineTo(19.5f, 71.6f)
                lineToRelative(5.6f, -3.2f)
                lineTo(25.1f, 47.1f)
                lineToRelative(21.0f, -12.2f)
                lineTo(46.1f, 29.0f)
                close()
                moveTo(81.7f, 40.0f)
                verticalLineToRelative(9.6f)
                lineTo(63.9f, 59.8f)
                lineTo(46.2f, 49.6f)
                verticalLineToRelative(-9.3f)
                lineToRelative(-16.5f, 9.5f)
                verticalLineToRelative(16.0f)
                lineToRelative(7.6f, -4.4f)
                lineToRelative(17.8f, 10.3f)
                verticalLineToRelative(20.5f)
                lineToRelative(-5.4f, 3.1f)
                lineToRelative(14.5f, 8.3f)
                lineToRelative(14.5f, -8.4f)
                lineToRelative(-5.3f, -3.0f)
                lineTo(73.4f, 71.7f)
                lineToRelative(17.8f, -10.3f)
                lineToRelative(7.4f, 4.3f)
                lineTo(98.6f, 49.8f)
                close()
                moveTo(88.9f, 95.8f)
                lineTo(88.9f, 83.2f)
                lineTo(78.1f, 77.0f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(104.3f, 77.0f)
                lineToRelative(-10.8f, 6.3f)
                verticalLineToRelative(12.5f)
                lineToRelative(10.8f, -6.3f)
                close()
                moveTo(35.0f, 95.8f)
                lineTo(35.0f, 83.3f)
                lineTo(24.1f, 77.0f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(50.5f, 77.1f)
                lineTo(39.7f, 83.3f)
                verticalLineToRelative(12.5f)
                lineToRelative(10.8f, -6.2f)
                close()
                moveTo(91.2f, 79.4f)
                lineTo(102.1f, 73.1f)
                lineTo(91.2f, 66.9f)
                lineTo(80.4f, 73.1f)
                close()
                moveTo(37.3f, 66.9f)
                lineToRelative(-10.8f, 6.2f)
                lineToRelative(10.8f, 6.3f)
                lineToRelative(10.8f, -6.3f)
                close()
                moveTo(61.6f, 53.3f)
                lineTo(61.6f, 40.8f)
                lineToRelative(-10.8f, -6.2f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(77.1f, 34.5f)
                lineTo(66.2f, 40.8f)
                verticalLineToRelative(12.5f)
                lineTo(77.1f, 47.0f)
                close()
                moveTo(63.9f, 36.8f)
                lineTo(74.8f, 30.5f)
                lineTo(63.9f, 24.3f)
                lineTo(53.1f, 30.5f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
