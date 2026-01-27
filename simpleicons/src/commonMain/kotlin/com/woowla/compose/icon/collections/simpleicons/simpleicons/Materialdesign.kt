package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Materialdesign: ImageVector
    get() {
        if (_materialdesign != null) {
            return _materialdesign!!
        }
        _materialdesign = Builder(name = "Materialdesign", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.655f, 0.0f, -3.218f, -0.309f, -4.691f, -0.927f)
                curveToRelative(-1.454f, -0.636f, -2.727f, -1.491f, -3.818f, -2.564f)
                curveToRelative(-1.073f, -1.09f, -1.927f, -2.363f, -2.563f, -3.818f)
                curveTo(0.308f, 15.218f, 0.0f, 13.655f, 0.0f, 12.0f)
                curveToRelative(0.0f, -1.673f, 0.309f, -3.236f, 0.927f, -4.691f)
                curveToRelative(0.637f, -1.454f, 1.491f, -2.718f, 2.564f, -3.791f)
                curveTo(4.582f, 2.428f, 5.854f, 1.573f, 7.309f, 0.955f)
                curveToRelative(1.473f, -0.637f, 3.036f, -0.955f, 4.691f, -0.955f)
                curveToRelative(1.673f, 0.0f, 3.236f, 0.318f, 4.691f, 0.955f)
                curveToRelative(1.454f, 0.618f, 2.718f, 1.472f, 3.791f, 2.563f)
                curveToRelative(1.091f, 1.073f, 1.945f, 2.336f, 2.563f, 3.791f)
                curveTo(23.681f, 8.764f, 24.0f, 10.328f, 24.0f, 12.0f)
                curveToRelative(0.0f, 1.655f, -0.319f, 3.218f, -0.955f, 4.691f)
                curveToRelative(-0.618f, 1.454f, -1.472f, 2.727f, -2.563f, 3.818f)
                curveToRelative(-1.073f, 1.073f, -2.336f, 1.927f, -3.791f, 2.564f)
                curveToRelative(-1.455f, 0.618f, -3.018f, 0.927f, -4.691f, 0.927f)
                close()
                moveTo(4.363f, 18.136f)
                lineTo(4.363f, 5.864f)
                arcTo(9.484f, 9.484f, 0.0f, false, false, 2.755f, 8.7f)
                curveTo(2.373f, 9.736f, 2.182f, 10.837f, 2.182f, 12.0f)
                reflectiveCurveToRelative(0.191f, 2.273f, 0.572f, 3.327f)
                arcToRelative(9.571f, 9.571f, 0.0f, false, false, 1.609f, 2.809f)
                close()
                moveTo(5.863f, 4.364f)
                lineTo(18.163f, 4.364f)
                arcToRelative(9.485f, 9.485f, 0.0f, false, false, -2.836f, -1.609f)
                curveToRelative(-1.055f, -0.382f, -2.164f, -0.572f, -3.327f, -0.572f)
                curveToRelative(-1.163f, 0.0f, -2.273f, 0.191f, -3.327f, 0.572f)
                arcToRelative(9.571f, 9.571f, 0.0f, false, false, -2.809f, 1.609f)
                close()
                moveTo(12.0f, 14.727f)
                lineTo(16.118f, 6.546f)
                lineTo(7.909f, 6.546f)
                close()
                moveTo(13.091f, 17.454f)
                horizontalLineToRelative(4.363f)
                lineTo(17.454f, 8.728f)
                close()
                moveTo(6.545f, 17.454f)
                horizontalLineToRelative(4.363f)
                lineTo(6.545f, 8.728f)
                close()
                moveTo(15.327f, 21.245f)
                curveToRelative(1.054f, -0.382f, 2.0f, -0.918f, 2.836f, -1.609f)
                lineTo(5.863f, 19.636f)
                arcToRelative(9.571f, 9.571f, 0.0f, false, false, 2.809f, 1.609f)
                curveToRelative(1.054f, 0.382f, 2.164f, 0.572f, 3.327f, 0.572f)
                curveToRelative(1.054f, 0.0f, 2.182f, -0.158f, 3.327f, -0.572f)
                close()
                moveTo(19.636f, 18.136f)
                arcToRelative(9.571f, 9.571f, 0.0f, false, false, 1.609f, -2.809f)
                curveToRelative(0.382f, -1.055f, 0.572f, -2.164f, 0.572f, -3.327f)
                curveToRelative(0.0f, -1.163f, -0.191f, -2.263f, -0.572f, -3.3f)
                curveToRelative(-0.382f, -1.055f, -0.918f, -2.0f, -1.609f, -2.836f)
                close()
            }
        }
        .build()
        return _materialdesign!!
    }

private var _materialdesign: ImageVector? = null
