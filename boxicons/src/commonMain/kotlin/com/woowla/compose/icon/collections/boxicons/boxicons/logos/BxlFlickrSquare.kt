package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlFlickrSquare: ImageVector
    get() {
        if (_bxlFlickrSquare != null) {
            return _bxlFlickrSquare!!
        }
        _bxlFlickrSquare = Builder(name = "BxlFlickrSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(21.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(8.747f, 14.746f)
                arcTo(2.745f, 2.745f, 0.0f, true, true, 11.494f, 12.0f)
                arcToRelative(2.744f, 2.744f, 0.0f, false, true, -2.747f, 2.746f)
                close()
                moveTo(15.253f, 14.746f)
                arcToRelative(2.746f, 2.746f, 0.0f, true, true, -0.001f, -5.493f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, true, 0.001f, 5.493f)
                close()
            }
        }
        .build()
        return _bxlFlickrSquare!!
    }

private var _bxlFlickrSquare: ImageVector? = null
