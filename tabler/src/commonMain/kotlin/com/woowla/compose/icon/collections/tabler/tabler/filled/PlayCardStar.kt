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

public val FilledGroup.PlayCardStar: ImageVector
    get() {
        if (_playCardStar != null) {
            return _playCardStar!!
        }
        _playCardStar = Builder(name = "PlayCardStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(17.01f, 18.0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-4.98f, -9.5f)
                lineToRelative(-0.115f, 0.005f)
                curveToRelative(-0.384f, 0.04f, -0.724f, 0.273f, -0.898f, 0.623f)
                lineToRelative(-0.51f, 1.027f)
                lineToRelative(-1.138f, 0.166f)
                curveToRelative(-0.423f, 0.059f, -0.78f, 0.357f, -0.914f, 0.768f)
                lineToRelative(-0.033f, 0.125f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, 0.322f, 1.039f)
                lineToRelative(0.82f, 0.797f)
                lineToRelative(-0.194f, 1.127f)
                curveToRelative(-0.07f, 0.432f, 0.107f, 0.857f, 0.454f, 1.108f)
                lineToRelative(0.107f, 0.068f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, 1.078f, 0.018f)
                lineToRelative(1.022f, -0.536f)
                lineToRelative(1.019f, 0.535f)
                curveToRelative(0.377f, 0.2f, 0.84f, 0.168f, 1.19f, -0.086f)
                lineToRelative(0.1f, -0.08f)
                curveToRelative(0.281f, -0.259f, 0.416f, -0.645f, 0.35f, -1.028f)
                lineToRelative(-0.194f, -1.126f)
                lineToRelative(0.823f, -0.799f)
                curveToRelative(0.31f, -0.302f, 0.42f, -0.752f, 0.287f, -1.161f)
                lineToRelative(-0.042f, -0.11f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -0.873f, -0.659f)
                lineToRelative(-1.138f, -0.166f)
                lineToRelative(-0.508f, -1.026f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, -1.014f, -0.63f)
                moveToRelative(-5.021f, -4.499f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _playCardStar!!
    }

private var _playCardStar: ImageVector? = null
