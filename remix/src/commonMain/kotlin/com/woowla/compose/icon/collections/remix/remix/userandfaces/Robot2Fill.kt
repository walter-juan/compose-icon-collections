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

public val UserAndFacesGroup.Robot2Fill: ImageVector
    get() {
        if (_robot2Fill != null) {
            return _robot2Fill!!
        }
        _robot2Fill = Builder(name = "Robot2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 2.0f)
                curveTo(13.5f, 2.444f, 13.307f, 2.843f, 13.0f, 3.118f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 5.0f, 21.0f, 6.343f, 21.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 6.343f, 4.343f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.118f)
                curveTo(10.693f, 2.843f, 10.5f, 2.444f, 10.5f, 2.0f)
                curveTo(10.5f, 1.172f, 11.172f, 0.5f, 12.0f, 0.5f)
                curveTo(12.828f, 0.5f, 13.5f, 1.172f, 13.5f, 2.0f)
                close()
                moveTo(0.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(24.0f, 10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(9.0f, 14.5f)
                curveTo(9.828f, 14.5f, 10.5f, 13.828f, 10.5f, 13.0f)
                curveTo(10.5f, 12.172f, 9.828f, 11.5f, 9.0f, 11.5f)
                curveTo(8.172f, 11.5f, 7.5f, 12.172f, 7.5f, 13.0f)
                curveTo(7.5f, 13.828f, 8.172f, 14.5f, 9.0f, 14.5f)
                close()
                moveTo(16.5f, 13.0f)
                curveTo(16.5f, 12.172f, 15.828f, 11.5f, 15.0f, 11.5f)
                curveTo(14.172f, 11.5f, 13.5f, 12.172f, 13.5f, 13.0f)
                curveTo(13.5f, 13.828f, 14.172f, 14.5f, 15.0f, 14.5f)
                curveTo(15.828f, 14.5f, 16.5f, 13.828f, 16.5f, 13.0f)
                close()
            }
        }
        .build()
        return _robot2Fill!!
    }

private var _robot2Fill: ImageVector? = null
