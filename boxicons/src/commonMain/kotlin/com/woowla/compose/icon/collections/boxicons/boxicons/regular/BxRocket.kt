package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxRocket: ImageVector
    get() {
        if (_bxRocket != null) {
            return _bxRocket!!
        }
        _bxRocket = Builder(name = "BxRocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.92f, 2.38f)
                arcTo(15.72f, 15.72f, 0.0f, false, false, 17.5f, 2.0f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, false, -6.0f, 2.06f)
                quadTo(9.89f, 5.67f, 8.31f, 7.27f)
                curveToRelative(-1.21f, -0.13f, -4.08f, -0.2f, -6.0f, 1.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.41f)
                lineToRelative(11.3f, 11.32f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 0.0f)
                curveToRelative(1.95f, -2.0f, 1.89f, -4.82f, 1.77f, -6.0f)
                lineToRelative(3.21f, -3.2f)
                curveToRelative(3.19f, -3.19f, 1.74f, -9.18f, 1.68f, -9.43f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.76f, -0.73f)
                close()
                moveTo(18.56f, 11.13f)
                lineTo(15.0f, 14.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.27f, 0.9f)
                arcToRelative(6.81f, 6.81f, 0.0f, false, true, -0.54f, 3.94f)
                lineTo(4.52f, 9.82f)
                arcToRelative(6.67f, 6.67f, 0.0f, false, true, 4.0f, -0.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.39f, 9.0f)
                reflectiveCurveToRelative(1.4f, -1.45f, 3.51f, -3.56f)
                arcTo(6.61f, 6.61f, 0.0f, false, true, 17.5f, 4.0f)
                arcToRelative(14.51f, 14.51f, 0.0f, false, true, 2.33f, 0.2f)
                curveToRelative(0.24f, 1.43f, 0.62f, 5.04f, -1.27f, 6.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.73f, 8.3f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                curveToRelative(-2.0f, 1.0f, -2.0f, 5.0f, -2.0f, 5.0f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, false, 5.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxRocket!!
    }

private var _bxRocket: ImageVector? = null
