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

public val UserAndFacesGroup.UserSettingsFill: ImageVector
    get() {
        if (_userSettingsFill != null) {
            return _userSettingsFill!!
        }
        _userSettingsFill = Builder(name = "UserSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.582f, 7.582f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(14.595f, 18.812f)
                curveTo(14.533f, 18.551f, 14.5f, 18.279f, 14.5f, 18.0f)
                curveTo(14.5f, 17.721f, 14.533f, 17.449f, 14.594f, 17.189f)
                lineTo(13.603f, 16.616f)
                lineTo(14.603f, 14.884f)
                lineTo(15.595f, 15.457f)
                curveTo(15.988f, 15.085f, 16.468f, 14.803f, 17.0f, 14.645f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.645f)
                curveTo(19.532f, 14.803f, 20.012f, 15.085f, 20.405f, 15.457f)
                lineTo(21.397f, 14.884f)
                lineTo(22.397f, 16.616f)
                lineTo(21.406f, 17.188f)
                curveTo(21.467f, 17.449f, 21.5f, 17.721f, 21.5f, 18.0f)
                curveTo(21.5f, 18.279f, 21.467f, 18.551f, 21.406f, 18.811f)
                lineTo(22.397f, 19.384f)
                lineTo(21.397f, 21.116f)
                lineTo(20.405f, 20.543f)
                curveTo(20.012f, 20.915f, 19.532f, 21.197f, 19.0f, 21.355f)
                verticalLineTo(22.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.355f)
                curveTo(16.468f, 21.197f, 15.988f, 20.915f, 15.595f, 20.543f)
                lineTo(14.603f, 21.116f)
                lineTo(13.603f, 19.384f)
                lineTo(14.595f, 18.812f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(17.448f, 17.0f, 17.0f, 17.448f, 17.0f, 18.0f)
                curveTo(17.0f, 18.552f, 17.448f, 19.0f, 18.0f, 19.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                curveTo(19.0f, 17.448f, 18.552f, 17.0f, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _userSettingsFill!!
    }

private var _userSettingsFill: ImageVector? = null
