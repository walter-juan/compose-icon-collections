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

public val SolidGroup.BxsBaseball: ImageVector
    get() {
        if (_bxsBaseball != null) {
            return _bxsBaseball!!
        }
        _bxsBaseball = Builder(name = "BxsBaseball", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.984f, 12.236f)
                arcToRelative(9.966f, 9.966f, 0.0f, false, false, -2.913f, -7.308f)
                arcToRelative(9.966f, 9.966f, 0.0f, false, false, -7.308f, -2.913f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, true, -0.673f, 4.313f)
                lineToRelative(-1.84f, -0.78f)
                arcToRelative(7.044f, 7.044f, 0.0f, false, false, 0.526f, -3.284f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, -4.847f, 2.665f)
                arcToRelative(9.924f, 9.924f, 0.0f, false, false, -2.666f, 4.852f)
                arcToRelative(7.082f, 7.082f, 0.0f, false, false, 2.576f, -0.276f)
                lineToRelative(0.575f, 1.916f)
                curveToRelative(-1.1f, 0.33f, -2.257f, 0.443f, -3.398f, 0.344f)
                arcToRelative(9.964f, 9.964f, 0.0f, false, false, 2.913f, 7.307f)
                arcToRelative(9.965f, 9.965f, 0.0f, false, false, 7.307f, 2.913f)
                arcToRelative(9.079f, 9.079f, 0.0f, false, true, 0.344f, -3.398f)
                lineToRelative(1.916f, 0.575f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, false, -0.276f, 2.576f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, 4.853f, -2.666f)
                arcToRelative(9.926f, 9.926f, 0.0f, false, false, 2.665f, -4.848f)
                arcToRelative(7.056f, 7.056f, 0.0f, false, false, -3.284f, 0.526f)
                lineToRelative(-0.78f, -1.841f)
                arcToRelative(9.025f, 9.025f, 0.0f, false, true, 4.31f, -0.673f)
                close()
                moveTo(9.17f, 9.173f)
                arcToRelative(9.017f, 9.017f, 0.0f, false, true, -2.192f, 1.612f)
                lineToRelative(-0.927f, -1.772f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, false, 2.576f, -2.314f)
                lineToRelative(1.663f, 1.113f)
                curveToRelative(-0.328f, 0.49f, -0.705f, 0.948f, -1.12f, 1.361f)
                close()
                moveTo(16.244f, 16.241f)
                arcToRelative(6.991f, 6.991f, 0.0f, false, false, -1.257f, 1.708f)
                lineToRelative(-1.772f, -0.927f)
                arcToRelative(9.025f, 9.025f, 0.0f, false, true, 2.972f, -3.312f)
                lineToRelative(1.113f, 1.663f)
                arcToRelative(6.987f, 6.987f, 0.0f, false, false, -1.056f, 0.868f)
                close()
            }
        }
        .build()
        return _bxsBaseball!!
    }

private var _bxsBaseball: ImageVector? = null
