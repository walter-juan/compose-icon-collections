package com.woowla.compose.icon.collections.boxicons.boxicons.solid

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
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCoffeeBean: ImageVector
    get() {
        if (_bxsCoffeeBean != null) {
            return _bxsCoffeeBean!!
        }
        _bxsCoffeeBean = Builder(name = "BxsCoffeeBean", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, 5.17f, -6.0f)
                arcToRelative(7.62f, 7.62f, 0.0f, false, true, 6.52f, -7.51f)
                lineToRelative(2.59f, -0.37f)
                curveToRelative(-0.07f, -0.08f, -0.13f, -0.16f, -0.21f, -0.24f)
                curveToRelative(-3.26f, -3.26f, -9.52f, -2.28f, -14.0f, 2.18f)
                curveTo(2.28f, 9.9f, 1.0f, 15.0f, 2.76f, 18.46f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.73f, 12.0f)
                arcToRelative(7.63f, 7.63f, 0.0f, false, true, -6.51f, 7.52f)
                lineToRelative(-2.46f, 0.35f)
                lineToRelative(0.15f, 0.17f)
                curveToRelative(3.26f, 3.26f, 9.52f, 2.29f, 14.0f, -2.17f)
                curveTo(21.68f, 14.11f, 23.0f, 9.0f, 21.25f, 5.59f)
                lineToRelative(-3.34f, 0.48f)
                arcTo(6.05f, 6.05f, 0.0f, false, false, 12.73f, 12.0f)
                close()
            }
        }
        .build()
        return _bxsCoffeeBean!!
    }

private var _bxsCoffeeBean: ImageVector? = null
