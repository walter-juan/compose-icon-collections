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

public val Twbs.Basket3Fill: ImageVector
    get() {
        if (_basket3Fill != null) {
            return _basket3Fill!!
        }
        _basket3Fill = Builder(name = "Basket3Fill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.757f, 1.071f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.172f, 0.686f)
                lineTo(3.383f, 6.0f)
                horizontalLineToRelative(9.234f)
                lineTo(10.07f, 1.757f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.858f, -0.514f)
                lineTo(13.783f, 6.0f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 6.0f)
                horizontalLineToRelative(1.717f)
                lineTo(5.07f, 1.243f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.686f, -0.172f)
                close()
                moveTo(2.468f, 15.426f)
                lineTo(0.943f, 9.0f)
                horizontalLineToRelative(14.114f)
                lineToRelative(-1.525f, 6.426f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.729f, 0.574f)
                horizontalLineTo(3.197f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.73f, -0.574f)
                close()
            }
        }
        .build()
        return _basket3Fill!!
    }

private var _basket3Fill: ImageVector? = null
