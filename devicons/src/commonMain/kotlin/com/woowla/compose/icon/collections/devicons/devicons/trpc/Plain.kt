package com.woowla.compose.icon.collections.devicons.devicons.trpc

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TrpcGroup

public val TrpcGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 38.0f)
                curveTo(0.0f, 17.0f, 17.0f, 0.0f, 38.0f, 0.0f)
                horizontalLineToRelative(52.0f)
                curveToRelative(21.0f, 0.0f, 38.0f, 17.0f, 38.0f, 38.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(0.0f, 21.0f, -17.0f, 38.0f, -38.0f, 38.0f)
                lineTo(38.0f, 128.0f)
                curveToRelative(-21.0f, 0.0f, -38.0f, -17.0f, -38.0f, -38.0f)
                close()
                moveTo(46.1f, 29.0f)
                verticalLineToRelative(5.9f)
                lineToRelative(-21.0f, 12.2f)
                verticalLineToRelative(21.3f)
                lineToRelative(-5.6f, 3.2f)
                verticalLineToRelative(20.5f)
                lineToRelative(17.8f, 10.3f)
                lineToRelative(7.7f, -4.5f)
                lineToRelative(19.1f, 11.0f)
                lineToRelative(19.2f, -11.1f)
                lineToRelative(7.9f, 4.6f)
                lineToRelative(17.7f, -10.2f)
                lineTo(108.9f, 71.6f)
                lineToRelative(-5.8f, -3.3f)
                lineTo(103.1f, 47.1f)
                lineTo(81.6f, 34.6f)
                lineTo(81.6f, 29.0f)
                lineTo(63.9f, 18.7f)
                close()
                moveTo(98.5f, 49.8f)
                verticalLineToRelative(15.9f)
                lineToRelative(-7.4f, -4.3f)
                lineToRelative(-17.8f, 10.3f)
                verticalLineToRelative(20.5f)
                lineToRelative(5.3f, 3.0f)
                lineToRelative(-14.6f, 8.4f)
                lineToRelative(-14.4f, -8.3f)
                lineToRelative(5.4f, -3.1f)
                lineTo(55.0f, 71.7f)
                lineTo(37.2f, 61.4f)
                lineToRelative(-7.6f, 4.4f)
                verticalLineToRelative(-16.0f)
                lineTo(46.0f, 40.3f)
                horizontalLineToRelative(0.1f)
                verticalLineToRelative(9.3f)
                lineToRelative(17.7f, 10.2f)
                lineToRelative(17.8f, -10.2f)
                lineTo(81.6f, 40.0f)
                close()
                moveTo(78.0f, 89.6f)
                lineTo(78.0f, 77.1f)
                lineToRelative(10.8f, 6.2f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(104.3f, 89.6f)
                lineTo(93.4f, 95.9f)
                lineTo(93.4f, 83.4f)
                lineToRelative(10.9f, -6.3f)
                close()
                moveTo(24.1f, 89.6f)
                lineTo(24.1f, 77.1f)
                lineTo(35.0f, 83.3f)
                verticalLineToRelative(12.6f)
                close()
                moveTo(50.3f, 89.6f)
                lineTo(39.5f, 95.8f)
                lineTo(39.5f, 83.3f)
                lineTo(50.3f, 77.0f)
                close()
                moveTo(80.2f, 73.2f)
                lineTo(91.1f, 66.9f)
                lineTo(101.9f, 73.2f)
                lineTo(91.1f, 79.4f)
                close()
                moveTo(48.0f, 73.2f)
                lineTo(37.1f, 79.5f)
                lineTo(26.3f, 73.2f)
                lineTo(37.1f, 66.9f)
                close()
                moveTo(50.7f, 47.1f)
                lineTo(50.7f, 34.6f)
                lineToRelative(10.8f, 6.2f)
                verticalLineToRelative(12.6f)
                close()
                moveTo(76.9f, 47.1f)
                lineTo(66.1f, 53.3f)
                lineTo(66.1f, 40.8f)
                lineToRelative(10.8f, -6.3f)
                close()
                moveTo(53.0f, 30.6f)
                lineToRelative(10.8f, -6.2f)
                lineToRelative(10.8f, 6.2f)
                lineToRelative(-10.8f, 6.3f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
