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

public val RegularGroup.BxPlanet: ImageVector
    get() {
        if (_bxPlanet != null) {
            return _bxPlanet!!
        }
        _bxPlanet = Builder(name = "BxPlanet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.76f, 20.2f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, 2.15f, 0.85f)
                arcToRelative(8.86f, 8.86f, 0.0f, false, false, 3.37f, -0.86f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 12.27f, -10.9f)
                curveToRelative(1.31f, -2.23f, 1.75f, -4.26f, 0.67f, -5.48f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, false, -2.57f, -1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 16.1f, 4.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.58f, 15.14f)
                curveToRelative(-1.06f, 1.21f, -2.05f, 3.68f, -0.82f, 5.06f)
                close()
                moveTo(4.26f, 18.88f)
                curveToRelative(-0.22f, -0.25f, 0.0f, -1.07f, 0.37f, -1.76f)
                arcToRelative(9.26f, 9.26f, 0.0f, false, false, 1.57f, 1.74f)
                curveToRelative(-1.03f, 0.3f, -1.71f, 0.28f, -1.94f, 0.02f)
                close()
                moveTo(18.77f, 13.71f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.58f, 18.0f)
                arcTo(7.12f, 7.12f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, true, -1.24f, -0.13f)
                arcToRelative(30.73f, 30.73f, 0.0f, false, false, 4.42f, -3.29f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, 3.8f, -4.0f)
                arcToRelative(6.88f, 6.88f, 0.0f, false, true, -0.21f, 2.13f)
                close()
                moveTo(18.86f, 4.82f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.87f, 0.32f)
                curveToRelative(0.23f, 0.26f, 0.16f, 0.94f, -0.26f, 1.93f)
                arcToRelative(9.2f, 9.2f, 0.0f, false, false, -1.61f, -1.86f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 1.0f, -0.39f)
                close()
                moveTo(5.22f, 10.31f)
                arcTo(6.94f, 6.94f, 0.0f, false, true, 8.41f, 6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 6.0f, 3.41f)
                arcToRelative(5.19f, 5.19f, 0.0f, false, true, 0.35f, 0.66f)
                arcToRelative(27.43f, 27.43f, 0.0f, false, true, -4.49f, 5.0f)
                arcTo(27.35f, 27.35f, 0.0f, false, true, 8.35f, 18.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -3.13f, -7.65f)
                close()
            }
        }
        .build()
        return _bxPlanet!!
    }

private var _bxPlanet: ImageVector? = null
