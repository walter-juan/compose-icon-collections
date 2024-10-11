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

public val UserAndFacesGroup.User5Fill: ImageVector
    get() {
        if (_user5Fill != null) {
            return _user5Fill!!
        }
        _user5Fill = Builder(name = "User5Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.389f, 16.539f)
                curveTo(5.339f, 15.09f, 4.0f, 12.701f, 4.0f, 10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                curveTo(20.0f, 12.701f, 18.661f, 15.09f, 16.611f, 16.539f)
                lineTo(18.694f, 21.3f)
                curveTo(18.804f, 21.553f, 18.689f, 21.847f, 18.436f, 21.958f)
                curveTo(18.373f, 21.986f, 18.305f, 22.0f, 18.236f, 22.0f)
                horizontalLineTo(5.765f)
                curveTo(5.488f, 22.0f, 5.265f, 21.776f, 5.265f, 21.5f)
                curveTo(5.265f, 21.431f, 5.279f, 21.363f, 5.306f, 21.3f)
                lineTo(7.389f, 16.539f)
                close()
                moveTo(8.119f, 10.97f)
                curveTo(8.552f, 12.711f, 10.125f, 14.0f, 12.0f, 14.0f)
                curveTo(13.875f, 14.0f, 15.448f, 12.711f, 15.882f, 10.97f)
                lineTo(13.941f, 10.485f)
                curveTo(13.724f, 11.355f, 12.937f, 12.0f, 12.0f, 12.0f)
                curveTo(11.063f, 12.0f, 10.276f, 11.355f, 10.059f, 10.485f)
                lineTo(8.119f, 10.97f)
                close()
            }
        }
        .build()
        return _user5Fill!!
    }

private var _user5Fill: ImageVector? = null
