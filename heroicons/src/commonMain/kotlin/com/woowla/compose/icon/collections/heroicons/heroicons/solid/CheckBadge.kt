package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.CheckBadge: ImageVector
    get() {
        if (_checkBadge != null) {
            return _checkBadge!!
        }
        _checkBadge = Builder(name = "CheckBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.603f, 3.799f)
                curveTo(9.427f, 2.851f, 10.643f, 2.25f, 12.0f, 2.25f)
                curveTo(13.357f, 2.25f, 14.573f, 2.851f, 15.397f, 3.799f)
                curveTo(16.65f, 3.711f, 17.935f, 4.146f, 18.895f, 5.106f)
                curveTo(19.854f, 6.065f, 20.289f, 7.35f, 20.202f, 8.603f)
                curveTo(21.149f, 9.427f, 21.75f, 10.644f, 21.75f, 12.0f)
                curveTo(21.75f, 13.357f, 21.149f, 14.573f, 20.201f, 15.397f)
                curveTo(20.288f, 16.65f, 19.853f, 17.935f, 18.894f, 18.894f)
                curveTo(17.935f, 19.854f, 16.65f, 20.289f, 15.397f, 20.201f)
                curveTo(14.573f, 21.149f, 13.357f, 21.75f, 12.0f, 21.75f)
                curveTo(10.643f, 21.75f, 9.427f, 21.149f, 8.603f, 20.201f)
                curveTo(7.35f, 20.289f, 6.065f, 19.854f, 5.105f, 18.895f)
                curveTo(4.146f, 17.935f, 3.711f, 16.65f, 3.798f, 15.397f)
                curveTo(2.851f, 14.573f, 2.25f, 13.356f, 2.25f, 12.0f)
                curveTo(2.25f, 10.643f, 2.851f, 9.427f, 3.799f, 8.603f)
                curveTo(3.711f, 7.35f, 4.146f, 6.065f, 5.106f, 5.106f)
                curveTo(6.065f, 4.146f, 7.35f, 3.711f, 8.603f, 3.799f)
                close()
                moveTo(15.61f, 10.186f)
                curveTo(15.851f, 9.849f, 15.773f, 9.38f, 15.436f, 9.14f)
                curveTo(15.099f, 8.899f, 14.63f, 8.977f, 14.39f, 9.314f)
                lineTo(11.154f, 13.844f)
                lineTo(9.53f, 12.22f)
                curveTo(9.237f, 11.927f, 8.763f, 11.927f, 8.47f, 12.22f)
                curveTo(8.177f, 12.513f, 8.177f, 12.987f, 8.47f, 13.28f)
                lineTo(10.72f, 15.53f)
                curveTo(10.876f, 15.686f, 11.092f, 15.766f, 11.312f, 15.747f)
                curveTo(11.532f, 15.729f, 11.732f, 15.615f, 11.86f, 15.436f)
                lineTo(15.61f, 10.186f)
                close()
            }
        }
        .build()
        return _checkBadge!!
    }

private var _checkBadge: ImageVector? = null
