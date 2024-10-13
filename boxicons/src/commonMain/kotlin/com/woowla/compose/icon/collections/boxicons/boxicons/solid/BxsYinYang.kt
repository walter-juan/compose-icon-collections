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

public val SolidGroup.BxsYinYang: ImageVector
    get() {
        if (_bxsYinYang != null) {
            return _bxsYinYang!!
        }
        _bxsYinYang = Builder(name = "BxsYinYang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.062f, 4.938f)
                arcTo(9.942f, 9.942f, 0.0f, false, false, 12.016f, 2.0f)
                horizontalLineToRelative(-0.026f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, -7.071f, 2.938f)
                curveToRelative(-3.898f, 3.898f, -3.898f, 10.243f, 0.0f, 14.143f)
                curveToRelative(1.895f, 1.895f, 4.405f, 2.938f, 7.071f, 2.938f)
                reflectiveCurveToRelative(5.177f, -1.043f, 7.071f, -2.938f)
                curveToRelative(3.9f, -3.899f, 3.9f, -10.243f, 0.001f, -14.143f)
                close()
                moveTo(13.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 15.0f)
                close()
                moveTo(6.333f, 6.353f)
                arcTo(7.953f, 7.953f, 0.0f, false, true, 11.99f, 4.0f)
                lineToRelative(0.026f, 0.001f)
                curveToRelative(1.652f, 0.008f, 3.242f, 1.066f, 3.55f, 2.371f)
                curveToRelative(0.366f, 1.552f, -1.098f, 3.278f, -4.018f, 4.737f)
                curveToRelative(-5.113f, 2.555f, -5.312f, 5.333f, -4.975f, 6.762f)
                lineToRelative(0.008f, 0.021f)
                curveToRelative(-0.082f, -0.075f, -0.169f, -0.146f, -0.249f, -0.226f)
                curveToRelative(-3.118f, -3.119f, -3.118f, -8.194f, 0.001f, -11.313f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxsYinYang!!
    }

private var _bxsYinYang: ImageVector? = null
