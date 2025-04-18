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

public val Twbs.Shadows: ImageVector
    get() {
        if (_shadows != null) {
            return _shadows!!
        }
        _shadows = Builder(name = "Shadows", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                moveToRelative(-8.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                quadToRelative(0.048f, 0.0f, 0.093f, 0.009f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.9f, 13.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(5.745f)
                quadToRelative(0.331f, -0.474f, 0.581f, -1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(6.71f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.22f, -1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                quadToRelative(0.0f, -0.51f, -0.07f, -1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(6.71f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.384f, -1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(5.745f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.846f, -1.0f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(3.608f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.0f, 15.0f)
            }
        }
        .build()
        return _shadows!!
    }

private var _shadows: ImageVector? = null
