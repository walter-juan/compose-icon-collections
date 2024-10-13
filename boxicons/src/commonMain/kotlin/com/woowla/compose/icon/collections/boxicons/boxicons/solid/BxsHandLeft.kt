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

public val SolidGroup.BxsHandLeft: ImageVector
    get() {
        if (_bxsHandLeft != null) {
            return _bxsHandLeft!!
        }
        _bxsHandLeft = Builder(name = "BxsHandLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineToRelative(-7.21f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.987f, 1.779f)
                lineTo(10.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-1.212f, 3.03f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, false, 1.225f, 2.641f)
                lineToRelative(0.34f, 0.113f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 1.084f, -0.309f)
                lineToRelative(4.332f, -5.197f)
                curveToRelative(0.149f, -0.179f, 0.231f, -0.406f, 0.231f, -0.64f)
                verticalLineTo(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _bxsHandLeft!!
    }

private var _bxsHandLeft: ImageVector? = null
