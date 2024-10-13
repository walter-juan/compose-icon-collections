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

public val SolidGroup.BxsRadiation: ImageVector
    get() {
        if (_bxsRadiation != null) {
            return _bxsRadiation!!
        }
        _bxsRadiation = Builder(name = "BxsRadiation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.912f, 8.531f)
                lineTo(7.121f, 3.877f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, false, -0.704f, -0.166f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, false, -4.396f, 7.604f)
                arcToRelative(0.505f, 0.505f, 0.0f, false, false, 0.497f, 0.528f)
                lineToRelative(5.421f, 0.09f)
                arcToRelative(4.042f, 4.042f, 0.0f, false, true, 1.973f, -3.402f)
                close()
                moveTo(18.021f, 4.021f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, false, -0.729f, 0.151f)
                lineTo(14.499f, 8.83f)
                arcToRelative(4.03f, 4.03f, 0.0f, false, true, 1.546f, 3.112f)
                lineToRelative(5.419f, -0.09f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, 0.499f, -0.53f)
                arcToRelative(9.986f, 9.986f, 0.0f, false, false, -3.942f, -7.301f)
                close()
                moveTo(13.954f, 15.532f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, true, -1.962f, 0.526f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, true, -1.963f, -0.526f)
                lineToRelative(-2.642f, 4.755f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.207f, 0.692f)
                arcTo(9.948f, 9.948f, 0.0f, false, false, 11.992f, 22.0f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, 4.396f, -1.021f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.207f, -0.692f)
                lineToRelative(-2.641f, -4.755f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
        }
        .build()
        return _bxsRadiation!!
    }

private var _bxsRadiation: ImageVector? = null
