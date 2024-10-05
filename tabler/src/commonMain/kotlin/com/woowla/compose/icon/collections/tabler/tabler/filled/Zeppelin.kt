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

public val FilledGroup.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) {
            return _zeppelin!!
        }
        _zeppelin = Builder(name = "Zeppelin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 3.0f)
                curveToRelative(5.187f, 0.0f, 9.5f, 3.044f, 9.5f, 7.0f)
                curveToRelative(0.0f, 3.017f, -2.508f, 5.503f, -6.0f, 6.514f)
                verticalLineToRelative(3.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.046f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -2.66f, -1.411f)
                lineToRelative(-0.13f, -0.082f)
                lineToRelative(-1.57f, 1.308f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.634f, -0.656f)
                lineToRelative(-0.006f, -0.113f)
                verticalLineToRelative(-2.851f)
                lineToRelative(-0.31f, -0.25f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, true, -0.682f, -0.568f)
                lineToRelative(-0.67f, -0.582f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.498f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, true, 1.351f, -1.151f)
                lineToRelative(0.311f, -0.25f)
                verticalLineToRelative(-2.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.55f, -0.836f)
                lineToRelative(0.09f, 0.068f)
                lineToRelative(1.57f, 1.307f)
                lineToRelative(0.128f, -0.08f)
                curveToRelative(2.504f, -1.553f, 4.784f, -2.378f, 6.853f, -2.453f)
                close()
                moveTo(11.001f, 16.657f)
                lineToRelative(-0.001f, 2.343f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.001f, -2.086f)
                quadToRelative(-0.735f, 0.086f, -1.501f, 0.086f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, true, -2.13f, -0.252f)
                close()
            }
        }
        .build()
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
