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

public val UserAndFacesGroup.AccountBox2Fill: ImageVector
    get() {
        if (_accountBox2Fill != null) {
            return _accountBox2Fill!!
        }
        _accountBox2Fill = Builder(name = "AccountBox2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.995f)
                curveTo(3.0f, 3.893f, 3.893f, 3.0f, 4.995f, 3.0f)
                horizontalLineTo(19.005f)
                curveTo(20.107f, 3.0f, 21.0f, 3.893f, 21.0f, 4.995f)
                verticalLineTo(19.005f)
                curveTo(21.0f, 20.107f, 20.107f, 21.0f, 19.005f, 21.0f)
                horizontalLineTo(4.995f)
                curveTo(3.893f, 21.0f, 3.0f, 20.107f, 3.0f, 19.005f)
                verticalLineTo(4.995f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.552f, 8.0f, 13.0f, 8.448f, 13.0f, 9.0f)
                curveTo(13.0f, 9.552f, 12.552f, 10.0f, 12.0f, 10.0f)
                curveTo(11.448f, 10.0f, 11.0f, 9.552f, 11.0f, 9.0f)
                curveTo(11.0f, 8.448f, 11.448f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.657f, 12.0f, 15.0f, 10.657f, 15.0f, 9.0f)
                curveTo(15.0f, 7.343f, 13.657f, 6.0f, 12.0f, 6.0f)
                curveTo(10.343f, 6.0f, 9.0f, 7.343f, 9.0f, 9.0f)
                curveTo(9.0f, 10.657f, 10.343f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.105f, 15.0f, 14.0f, 15.895f, 14.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 14.791f, 14.209f, 13.0f, 12.0f, 13.0f)
                curveTo(9.791f, 13.0f, 8.0f, 14.791f, 8.0f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 15.895f, 10.895f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _accountBox2Fill!!
    }

private var _accountBox2Fill: ImageVector? = null
