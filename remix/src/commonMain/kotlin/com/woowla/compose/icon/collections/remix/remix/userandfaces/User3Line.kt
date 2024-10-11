package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.User3Line: ImageVector
    get() {
        if (_user3Line != null) {
            return _user3Line!!
        }
        _user3Line = Builder(name = "User3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 18.343f, 16.657f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(7.343f, 17.0f, 6.0f, 18.343f, 6.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 17.239f, 6.239f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(17.761f, 15.0f, 20.0f, 17.239f, 20.0f, 20.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.686f, 13.0f, 6.0f, 10.314f, 6.0f, 7.0f)
                curveTo(6.0f, 3.686f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 3.686f, 18.0f, 7.0f)
                curveTo(18.0f, 10.314f, 15.314f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.209f, 11.0f, 16.0f, 9.209f, 16.0f, 7.0f)
                curveTo(16.0f, 4.791f, 14.209f, 3.0f, 12.0f, 3.0f)
                curveTo(9.791f, 3.0f, 8.0f, 4.791f, 8.0f, 7.0f)
                curveTo(8.0f, 9.209f, 9.791f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _user3Line!!
    }

private var _user3Line: ImageVector? = null
