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

public val Simpleicons.Glassdoor: ImageVector
    get() {
        if (_glassdoor != null) {
            return _glassdoor!!
        }
        _glassdoor = Builder(name = "Glassdoor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.109f, 0.001f)
                curveToRelative(-0.075f, -0.007f, -0.135f, 0.052f, -0.135f, 0.127f)
                verticalLineToRelative(3.451f)
                curveToRelative(0.0f, 0.067f, 0.054f, 0.119f, 0.121f, 0.127f)
                curveToRelative(2.619f, 0.172f, 4.609f, 0.95f, 4.609f, 3.681f)
                horizontalLineTo(13.086f)
                arcToRelative(0.134f, 0.134f, 0.0f, false, false, -0.135f, 0.135f)
                verticalLineToRelative(8.964f)
                curveToRelative(0.0f, 0.075f, 0.06f, 0.135f, 0.135f, 0.135f)
                horizontalLineToRelative(10.003f)
                curveToRelative(0.075f, 0.0f, 0.135f, -0.06f, 0.135f, -0.135f)
                verticalLineTo(7.342f)
                curveToRelative(0.0f, -2.237f, -0.8f, -4.056f, -2.416f, -5.328f)
                curveTo(19.319f, 0.847f, 17.087f, 0.143f, 14.109f, 0.001f)
                close()
                moveTo(0.911f, 7.387f)
                arcToRelative(0.134f, 0.134f, 0.0f, false, false, -0.135f, 0.135f)
                verticalLineToRelative(8.957f)
                curveToRelative(0.0f, 0.075f, 0.06f, 0.135f, 0.135f, 0.135f)
                horizontalLineToRelative(5.619f)
                curveToRelative(0.0f, 2.731f, -1.99f, 3.509f, -4.609f, 3.681f)
                curveToRelative(-0.067f, 0.007f, -0.119f, 0.06f, -0.119f, 0.127f)
                verticalLineToRelative(3.451f)
                curveToRelative(0.0f, 0.075f, 0.06f, 0.134f, 0.135f, 0.127f)
                curveToRelative(2.978f, -0.142f, 5.208f, -0.846f, 6.697f, -2.014f)
                curveToRelative(1.616f, -1.272f, 2.416f, -3.091f, 2.416f, -5.328f)
                verticalLineTo(7.522f)
                arcToRelative(0.134f, 0.134f, 0.0f, false, false, -0.135f, -0.135f)
                close()
            }
        }
        .build()
        return _glassdoor!!
    }

private var _glassdoor: ImageVector? = null
