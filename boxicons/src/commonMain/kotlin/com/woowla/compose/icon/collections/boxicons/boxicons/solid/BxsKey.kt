package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsKey: ImageVector
    get() {
        if (_bxsKey != null) {
            return _bxsKey!!
        }
        _bxsKey = Builder(name = "BxsKey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.433f, 17.325f)
                lineTo(3.079f, 19.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.131f, 1.131f)
                lineToRelative(2.475f, -0.354f)
                curveTo(7.06f, 20.524f, 8.0f, 18.0f, 8.0f, 18.0f)
                reflectiveCurveToRelative(0.472f, 0.405f, 0.665f, 0.466f)
                curveToRelative(0.412f, 0.13f, 0.813f, -0.274f, 0.948f, -0.684f)
                lineTo(10.0f, 16.01f)
                reflectiveCurveToRelative(0.577f, 0.292f, 0.786f, 0.335f)
                curveToRelative(0.266f, 0.055f, 0.524f, -0.109f, 0.707f, -0.293f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 0.241f, -0.391f)
                lineTo(12.0f, 14.01f)
                reflectiveCurveToRelative(0.675f, 0.187f, 0.906f, 0.214f)
                curveToRelative(0.263f, 0.03f, 0.519f, -0.104f, 0.707f, -0.293f)
                lineToRelative(1.138f, -1.137f)
                arcToRelative(5.502f, 5.502f, 0.0f, false, false, 5.581f, -1.338f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, 0.0f, -7.778f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -7.778f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.338f, 5.581f)
                lineToRelative(-7.501f, 7.5f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.282f, 0.566f)
                close()
                moveTo(18.504f, 5.506f)
                arcToRelative(2.919f, 2.919f, 0.0f, false, true, 0.0f, 4.122f)
                lineToRelative(-4.122f, -4.122f)
                arcToRelative(2.919f, 2.919f, 0.0f, false, true, 4.122f, 0.0f)
                close()
            }
        }
        .build()
        return _bxsKey!!
    }

private var _bxsKey: ImageVector? = null
