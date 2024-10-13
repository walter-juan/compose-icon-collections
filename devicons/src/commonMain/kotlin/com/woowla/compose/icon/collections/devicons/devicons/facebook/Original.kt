package com.woowla.compose.icon.collections.devicons.devicons.facebook

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FacebookGroup

public val FacebookGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3d5a98)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.36f, 4.83f)
                lineTo(116.65f, 4.83f)
                arcTo(6.53f, 6.53f, 0.0f, false, true, 123.18f, 11.36f)
                lineTo(123.18f, 116.65f)
                arcTo(6.53f, 6.53f, 0.0f, false, true, 116.65f, 123.18f)
                lineTo(11.36f, 123.18f)
                arcTo(6.53f, 6.53f, 0.0f, false, true, 4.83f, 116.65f)
                lineTo(4.83f, 11.36f)
                arcTo(6.53f, 6.53f, 0.0f, false, true, 11.36f, 4.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.48f, 123.17f)
                verticalLineTo(77.34f)
                horizontalLineToRelative(15.38f)
                lineToRelative(2.3f, -17.86f)
                horizontalLineTo(86.48f)
                verticalLineToRelative(-11.4f)
                curveToRelative(0.0f, -5.17f, 1.44f, -8.7f, 8.85f, -8.7f)
                horizontalLineToRelative(9.46f)
                verticalLineToRelative(-16.0f)
                arcTo(126.56f, 126.56f, 0.0f, false, false, 91.0f, 22.7f)
                curveToRelative(-13.62f, 0.0f, -23.0f, 8.3f, -23.0f, 23.61f)
                verticalLineToRelative(13.17f)
                horizontalLineTo(52.62f)
                verticalLineToRelative(17.86f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(45.83f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
