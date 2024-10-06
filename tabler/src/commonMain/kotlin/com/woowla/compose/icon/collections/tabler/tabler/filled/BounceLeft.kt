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

public val FilledGroup.BounceLeft: ImageVector
    get() {
        if (_bounceLeft != null) {
            return _bounceLeft!!
        }
        _bounceLeft = Builder(name = "BounceLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.486f, 11.143f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.371f, 0.343f)
                curveToRelative(1.045f, 1.74f, 1.83f, 3.443f, 2.392f, 5.237f)
                lineToRelative(0.172f, 0.581f)
                lineToRelative(0.092f, -0.13f)
                curveToRelative(2.093f, -2.921f, 4.48f, -3.653f, 7.565f, -2.7f)
                lineToRelative(0.238f, 0.077f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.632f, 1.898f)
                curveToRelative(-2.932f, -0.978f, -4.73f, -0.122f, -6.79f, 3.998f)
                curveToRelative(-0.433f, 0.866f, -1.721f, 0.673f, -1.88f, -0.283f)
                curveToRelative(-0.46f, -2.76f, -1.369f, -5.145f, -2.871f, -7.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.343f, -1.371f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bounceLeft!!
    }

private var _bounceLeft: ImageVector? = null
