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

public val UserAndFacesGroup.GenderlessFill: ImageVector
    get() {
        if (_genderlessFill != null) {
            return _genderlessFill!!
        }
        _genderlessFill = Builder(name = "GenderlessFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.066f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.066f)
                curveTo(16.669f, 7.555f, 19.5f, 10.697f, 19.5f, 14.5f)
                curveTo(19.5f, 18.642f, 16.142f, 22.0f, 12.0f, 22.0f)
                curveTo(7.858f, 22.0f, 4.5f, 18.642f, 4.5f, 14.5f)
                curveTo(4.5f, 10.697f, 7.331f, 7.555f, 11.0f, 7.066f)
                close()
            }
        }
        .build()
        return _genderlessFill!!
    }

private var _genderlessFill: ImageVector? = null
