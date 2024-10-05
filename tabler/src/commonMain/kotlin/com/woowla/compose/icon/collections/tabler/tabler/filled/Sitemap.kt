package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Sitemap: ImageVector
    get() {
        if (_sitemap != null) {
            return _sitemap!!
        }
        _sitemap = Builder(name = "Sitemap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.667f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.667f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.667f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, -2.667f)
                horizontalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, 2.667f, 2.667f)
                verticalLineToRelative(2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, 2.667f)
                horizontalLineToRelative(-2.666f)
                arcToRelative(2.667f, 2.667f, 0.0f, false, true, -2.667f, -2.667f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.645f, 0.0f, -3.0f, 1.355f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.564f, 0.436f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.564f, 0.0f, 1.0f, 0.436f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.645f, -1.355f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _sitemap!!
    }

private var _sitemap: ImageVector? = null
