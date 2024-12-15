package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Nextflow: ImageVector
    get() {
        if (_nextflow != null) {
            return _nextflow!!
        }
        _nextflow = Builder(name = "Nextflow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.005f, 4.424f)
                verticalLineTo(0.0f)
                curveToRelative(6.228f, 0.259f, 11.227f, 5.268f, 11.477f, 11.506f)
                horizontalLineTo(7.058f)
                curveTo(6.828f, 7.715f, 3.786f, 4.673f, 0.005f, 4.424f)
                moveToRelative(7.082f, 8.089f)
                horizontalLineToRelative(4.424f)
                curveTo(11.251f, 18.741f, 6.242f, 23.741f, 0.005f, 23.99f)
                verticalLineToRelative(-4.423f)
                curveToRelative(3.79f, -0.231f, 6.832f, -3.273f, 7.082f, -7.054f)
                moveToRelative(9.826f, -1.036f)
                horizontalLineToRelative(-4.424f)
                curveTo(12.749f, 5.249f, 17.758f, 0.25f, 23.995f, 0.0f)
                verticalLineToRelative(4.424f)
                curveToRelative(-3.79f, 0.23f, -6.832f, 3.263f, -7.082f, 7.053f)
                moveToRelative(7.082f, 8.099f)
                verticalLineTo(24.0f)
                curveToRelative(-6.228f, -0.259f, -11.227f, -5.268f, -11.477f, -11.506f)
                horizontalLineToRelative(4.424f)
                curveToRelative(0.23f, 3.791f, 3.272f, 6.833f, 7.053f, 7.082f)
            }
        }
        .build()
        return _nextflow!!
    }

private var _nextflow: ImageVector? = null
