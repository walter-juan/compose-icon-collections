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

public val UserAndFacesGroup.RobotLine: ImageVector
    get() {
        if (_robotLine != null) {
            return _robotLine!!
        }
        _robotLine = Builder(name = "RobotLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.055f)
                curveTo(17.5f, 4.552f, 21.0f, 8.367f, 21.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 8.367f, 6.5f, 4.552f, 11.0f, 4.055f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.055f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineTo(13.0f)
                curveTo(19.0f, 9.134f, 15.866f, 6.0f, 12.0f, 6.0f)
                curveTo(8.134f, 6.0f, 5.0f, 9.134f, 5.0f, 13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(9.239f, 18.0f, 7.0f, 15.761f, 7.0f, 13.0f)
                curveTo(7.0f, 10.239f, 9.239f, 8.0f, 12.0f, 8.0f)
                curveTo(14.761f, 8.0f, 17.0f, 10.239f, 17.0f, 13.0f)
                curveTo(17.0f, 15.761f, 14.761f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(13.657f, 16.0f, 15.0f, 14.657f, 15.0f, 13.0f)
                curveTo(15.0f, 11.343f, 13.657f, 10.0f, 12.0f, 10.0f)
                curveTo(10.343f, 10.0f, 9.0f, 11.343f, 9.0f, 13.0f)
                curveTo(9.0f, 14.657f, 10.343f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(11.448f, 14.0f, 11.0f, 13.552f, 11.0f, 13.0f)
                curveTo(11.0f, 12.448f, 11.448f, 12.0f, 12.0f, 12.0f)
                curveTo(12.552f, 12.0f, 13.0f, 12.448f, 13.0f, 13.0f)
                curveTo(13.0f, 13.552f, 12.552f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _robotLine!!
    }

private var _robotLine: ImageVector? = null
