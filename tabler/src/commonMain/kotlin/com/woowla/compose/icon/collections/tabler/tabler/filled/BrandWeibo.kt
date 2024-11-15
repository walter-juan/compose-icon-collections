package com.woowla.compose.icon.collections.tabler.tabler.filled

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
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) {
            return _brandWeibo!!
        }
        _brandWeibo = Builder(name = "BrandWeibo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.972f, 8.183f)
                curveToRelative(2.81f, -2.987f, 6.162f, -4.207f, 8.006f, -2.24f)
                curveToRelative(0.298f, 0.316f, 0.554f, 0.773f, 0.736f, 1.266f)
                lineToRelative(0.127f, -0.031f)
                curveToRelative(2.064f, -0.469f, 4.0f, 1.287f, 3.817f, 3.544f)
                lineToRelative(-0.005f, 0.036f)
                lineToRelative(0.15f, 0.057f)
                curveToRelative(1.46f, 0.574f, 2.14f, 1.355f, 2.193f, 3.081f)
                lineToRelative(0.004f, 0.231f)
                curveToRelative(0.0f, 3.776f, -4.107f, 6.873f, -9.0f, 6.873f)
                curveToRelative(-4.854f, 0.0f, -9.0f, -2.72f, -9.0f, -6.565f)
                curveToRelative(0.0f, -2.04f, 1.068f, -4.222f, 2.972f, -6.252f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
