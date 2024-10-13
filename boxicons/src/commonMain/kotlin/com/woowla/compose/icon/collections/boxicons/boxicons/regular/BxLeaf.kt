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

public val RegularGroup.BxLeaf: ImageVector
    get() {
        if (_bxLeaf != null) {
            return _bxLeaf!!
        }
        _bxLeaf = Builder(name = "BxLeaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.88f, 2.15f)
                lineToRelative(-1.2f, 0.4f)
                arcToRelative(13.84f, 13.84f, 0.0f, false, true, -6.41f, 0.64f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, -6.68f, 0.9f)
                arcTo(7.23f, 7.23f, 0.0f, false, false, 3.3f, 9.5f)
                arcToRelative(8.65f, 8.65f, 0.0f, false, false, 1.47f, 6.6f)
                curveToRelative(-0.06f, 0.21f, -0.12f, 0.42f, -0.17f, 0.63f)
                arcTo(22.6f, 22.6f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(30.69f, 30.69f, 0.0f, false, true, 0.59f, -4.32f)
                arcToRelative(9.25f, 9.25f, 0.0f, false, false, 4.52f, 1.11f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 4.28f, -0.87f)
                curveTo(23.0f, 14.67f, 22.0f, 3.86f, 22.0f, 3.41f)
                close()
                moveTo(14.61f, 16.08f)
                curveToRelative(-2.61f, 1.11f, -5.73f, 0.92f, -7.48f, -0.45f)
                arcToRelative(13.79f, 13.79f, 0.0f, false, true, 1.21f, -2.84f)
                arcTo(10.17f, 10.17f, 0.0f, false, true, 9.73f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.81f, -1.42f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 16.0f, 8.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(11.43f, 11.43f, 0.0f, false, false, -5.26f, 1.08f)
                arcToRelative(10.28f, 10.28f, 0.0f, false, false, -4.12f, 3.65f)
                arcToRelative(15.07f, 15.07f, 0.0f, false, false, -1.0f, 1.87f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.38f, -3.73f)
                arcToRelative(5.24f, 5.24f, 0.0f, false, true, 3.14f, -4.0f)
                arcToRelative(8.93f, 8.93f, 0.0f, false, true, 3.82f, -0.84f)
                curveToRelative(0.62f, 0.0f, 1.23f, 0.06f, 1.87f, 0.11f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 6.0f, -0.35f)
                curveTo(20.0f, 7.55f, 19.5f, 14.0f, 14.61f, 16.08f)
                close()
            }
        }
        .build()
        return _bxLeaf!!
    }

private var _bxLeaf: ImageVector? = null
