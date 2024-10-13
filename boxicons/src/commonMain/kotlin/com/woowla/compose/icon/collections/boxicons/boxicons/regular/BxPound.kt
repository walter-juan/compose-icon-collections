package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPound: ImageVector
    get() {
        if (_bxPound != null) {
            return _bxPound!!
        }
        _bxPound = Builder(name = "BxPound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.553f, 19.105f)
                lineToRelative(0.764f, 1.843f)
                curveTo(7.498f, 20.555f, 9.422f, 20.0f, 10.0f, 20.0f)
                curveToRelative(0.838f, 0.0f, 1.462f, 0.208f, 2.184f, 0.448f)
                curveToRelative(0.775f, 0.259f, 1.654f, 0.552f, 2.816f, 0.552f)
                curveToRelative(1.177f, 0.0f, 3.078f, -0.921f, 3.447f, -1.105f)
                lineToRelative(-0.895f, -1.789f)
                curveToRelative(-0.721f, 0.36f, -2.031f, 0.894f, -2.552f, 0.894f)
                curveToRelative(-0.838f, 0.0f, -1.462f, -0.208f, -2.184f, -0.448f)
                curveTo(12.041f, 18.293f, 11.162f, 18.0f, 10.0f, 18.0f)
                curveToRelative(-0.229f, 0.0f, -0.526f, 0.037f, -0.857f, 0.099f)
                curveTo(9.702f, 16.95f, 10.0f, 15.561f, 10.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(9.626f)
                curveToRelative(-0.042f, -0.107f, -0.084f, -0.216f, -0.125f, -0.317f)
                curveTo(9.243f, 11.052f, 9.0f, 10.455f, 9.0f, 9.0f)
                curveToRelative(0.0f, -1.369f, 0.521f, -3.0f, 3.0f, -3.0f)
                curveToRelative(2.224f, 0.0f, 3.021f, 2.227f, 3.052f, 2.316f)
                lineToRelative(1.896f, -0.633f)
                curveTo(16.898f, 7.533f, 15.679f, 4.0f, 12.0f, 4.0f)
                curveTo(8.313f, 4.0f, 7.0f, 6.583f, 7.0f, 9.0f)
                curveToRelative(0.0f, 1.491f, 0.234f, 2.35f, 0.478f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.467f, -0.892f, 4.328f, -2.447f, 5.105f)
                close()
            }
        }
        .build()
        return _bxPound!!
    }

private var _bxPound: ImageVector? = null
