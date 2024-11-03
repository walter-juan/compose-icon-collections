package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BoundingBoxCircles: ImageVector
    get() {
        if (_boundingBoxCircles != null) {
            return _boundingBoxCircles!!
        }
        _boundingBoxCircles = Builder(name = "BoundingBoxCircles", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.937f, -0.5f)
                horizontalLineToRelative(8.126f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 14.5f, 3.937f)
                verticalLineToRelative(8.126f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.437f, 2.437f)
                horizontalLineTo(3.937f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 1.5f, 12.063f)
                verticalLineTo(3.937f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(2.5f, 1.937f)
                verticalLineToRelative(8.126f)
                curveToRelative(0.703f, 0.18f, 1.256f, 0.734f, 1.437f, 1.437f)
                horizontalLineToRelative(8.126f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.437f, -1.437f)
                verticalLineTo(3.937f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.063f, 2.5f)
                horizontalLineTo(3.937f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.5f, 3.937f)
                moveTo(14.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(2.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(12.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _boundingBoxCircles!!
    }

private var _boundingBoxCircles: ImageVector? = null
