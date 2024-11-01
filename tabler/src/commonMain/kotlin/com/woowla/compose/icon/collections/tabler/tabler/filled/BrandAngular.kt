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

public val FilledGroup.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) {
            return _brandAngular!!
        }
        _brandAngular = Builder(name = "BrandAngular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.665f, 2.174f)
                lineToRelative(7.4f, 2.612f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.316f, 2.156f)
                lineToRelative(-1.323f, 9.703f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.99f, 1.468f)
                lineToRelative(-6.076f, 3.471f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.984f, 0.0f)
                lineToRelative(-6.076f, -3.47f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.96f, -1.3f)
                lineToRelative(-0.03f, -0.167f)
                lineToRelative(-1.322f, -9.704f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.316f, -2.156f)
                lineToRelative(7.4f, -2.613f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.33f, 0.0f)
                moveToRelative(0.271f, 4.475f)
                curveToRelative(-0.324f, -0.865f, -1.548f, -0.865f, -1.872f, 0.0f)
                lineToRelative(-3.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.585f, 1.287f)
                lineToRelative(0.111f, 0.035f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.176f, -0.62f)
                lineToRelative(0.506f, -1.351f)
                horizontalLineToRelative(3.113f)
                lineToRelative(0.508f, 1.352f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.176f, 0.62f)
                lineToRelative(0.111f, -0.035f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.585f, -1.287f)
                close()
                moveTo(12.0f, 9.848f)
                lineToRelative(0.807f, 2.151f)
                horizontalLineToRelative(-1.614f)
                close()
            }
        }
        .build()
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
