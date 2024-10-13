package com.woowla.compose.icon.collections.devicons.devicons.rect

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
import com.woowla.compose.icon.collections.devicons.devicons.RectGroup

public val RectGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF292929)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 4.85312f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.76f, 5.76f)
                horizontalLineToRelative(116.48f)
                verticalLineToRelative(116.48f)
                lineTo(5.76f, 122.24f)
                close()
                moveTo(5.76f, 5.76f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.07f, 95.09f)
                lineTo(56.11f, 95.09f)
                verticalLineToRelative(18.96f)
                lineTo(75.07f, 114.05f)
                verticalLineToRelative(-3.79f)
                lineTo(59.91f, 110.26f)
                verticalLineToRelative(-3.79f)
                horizontalLineToRelative(7.43f)
                verticalLineToRelative(-3.79f)
                horizontalLineToRelative(-7.43f)
                verticalLineToRelative(-3.79f)
                lineTo(75.07f, 98.88f)
                close()
                moveTo(97.67f, 95.09f)
                lineTo(78.86f, 95.09f)
                verticalLineToRelative(18.96f)
                horizontalLineToRelative(18.81f)
                verticalLineToRelative(-3.79f)
                lineTo(82.5f, 110.26f)
                lineTo(82.5f, 98.88f)
                horizontalLineToRelative(15.16f)
                close()
                moveTo(119.81f, 95.09f)
                horizontalLineToRelative(-18.19f)
                verticalLineToRelative(3.79f)
                horizontalLineToRelative(7.58f)
                verticalLineToRelative(15.16f)
                horizontalLineToRelative(3.79f)
                lineTo(112.99f, 98.88f)
                horizontalLineToRelative(6.82f)
                close()
                moveTo(33.21f, 95.09f)
                verticalLineToRelative(18.96f)
                horizontalLineToRelative(3.79f)
                lineTo(37.0f, 98.88f)
                horizontalLineToRelative(11.38f)
                verticalLineToRelative(7.58f)
                horizontalLineToRelative(3.79f)
                lineTo(52.17f, 95.09f)
                close()
                moveTo(33.21f, 95.09f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.38f, 102.67f)
                lineTo(37.0f, 102.67f)
                verticalLineToRelative(3.79f)
                horizontalLineToRelative(7.58f)
                verticalLineToRelative(3.79f)
                horizontalLineToRelative(3.79f)
                close()
                moveTo(52.17f, 110.26f)
                horizontalLineToRelative(-3.79f)
                verticalLineToRelative(3.79f)
                horizontalLineToRelative(3.79f)
                close()
                moveTo(52.17f, 110.26f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
