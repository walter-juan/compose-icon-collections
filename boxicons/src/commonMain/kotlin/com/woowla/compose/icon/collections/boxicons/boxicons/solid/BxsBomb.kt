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

public val SolidGroup.BxsBomb: ImageVector
    get() {
        if (_bxsBomb != null) {
            return _bxsBomb!!
        }
        _bxsBomb = Builder(name = "BxsBomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.293f, 4.293f)
                lineToRelative(-1.086f, 1.086f)
                lineToRelative(-1.086f, -1.086f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.414f, 0.0f)
                lineToRelative(-1.249f, 1.249f)
                arcTo(8.427f, 8.427f, 0.0f, false, false, 10.499f, 5.0f)
                curveTo(5.813f, 5.0f, 2.0f, 8.813f, 2.0f, 13.5f)
                reflectiveCurveTo(5.813f, 22.0f, 10.499f, 22.0f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                arcToRelative(8.42f, 8.42f, 0.0f, false, false, -0.431f, -2.654f)
                lineTo(19.914f, 9.5f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-1.293f, -1.293f)
                lineToRelative(1.09f, -1.09f)
                curveTo(19.94f, 5.474f, 20.556f, 5.0f, 21.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.4f, 0.0f, -2.584f, 1.167f, -2.707f, 1.293f)
                close()
                moveTo(10.499f, 10.0f)
                curveToRelative(-0.935f, 0.0f, -1.813f, 0.364f, -2.475f, 1.025f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 7.0f, 13.5f)
                horizontalLineTo(5.0f)
                curveToRelative(0.0f, -1.468f, 0.571f, -2.849f, 1.609f, -3.888f)
                arcTo(5.464f, 5.464f, 0.0f, false, true, 10.499f, 8.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsBomb!!
    }

private var _bxsBomb: ImageVector? = null
