package com.woowla.compose.icon.collections.octicons.octicons

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
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Space16: ImageVector
    get() {
        if (_space16 != null) {
            return _space16!!
        }
        _space16 = Builder(name = "Space16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                horizontalLineTo(5.0f)
                curveToRelative(0.551f, 0.0f, 1.07f, 0.26f, 1.4f, 0.7f)
                lineToRelative(0.9f, 1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.2f, 0.1f)
                horizontalLineToRelative(6.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(3.638f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineTo(7.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.4f, -0.7f)
                lineToRelative(-0.9f, -1.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.2f, -0.1f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(5.663f)
                lineToRelative(0.076f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.492f)
                lineTo(7.413f, 15.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.265f, 9.16f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, 0.467f, 0.0f)
                lineToRelative(0.237f, 0.649f)
                arcToRelative(3.726f, 3.726f, 0.0f, false, false, 2.219f, 2.218f)
                lineToRelative(0.649f, 0.238f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.0f, 0.467f)
                lineToRelative(-0.649f, 0.237f)
                arcToRelative(3.728f, 3.728f, 0.0f, false, false, -2.219f, 2.219f)
                lineToRelative(-0.237f, 0.649f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, -0.467f, 0.0f)
                lineToRelative(-0.238f, -0.649f)
                arcToRelative(3.726f, 3.726f, 0.0f, false, false, -2.218f, -2.219f)
                lineToRelative(-0.649f, -0.237f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, 0.0f, -0.467f)
                lineToRelative(0.649f, -0.238f)
                arcToRelative(3.725f, 3.725f, 0.0f, false, false, 2.218f, -2.218f)
                lineToRelative(0.238f, -0.649f)
                close()
            }
        }
        .build()
        return _space16!!
    }

private var _space16: ImageVector? = null
