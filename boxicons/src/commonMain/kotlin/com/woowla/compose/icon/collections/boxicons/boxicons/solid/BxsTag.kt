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

public val SolidGroup.BxsTag: ImageVector
    get() {
        if (_bxsTag != null) {
            return _bxsTag!!
        }
        _bxsTag = Builder(name = "BxsTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.842f, 6.218f)
                arcToRelative(1.977f, 1.977f, 0.0f, false, false, -0.424f, -0.628f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 20.0f, 5.0f)
                horizontalLineTo(8.0f)
                curveToRelative(-0.297f, 0.0f, -0.578f, 0.132f, -0.769f, 0.359f)
                lineToRelative(-5.0f, 6.0f)
                curveToRelative(-0.309f, 0.371f, -0.309f, 0.91f, 0.0f, 1.281f)
                lineToRelative(5.0f, 6.0f)
                curveToRelative(0.191f, 0.228f, 0.472f, 0.36f, 0.769f, 0.36f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.977f, 1.977f, 0.0f, false, false, 1.41f, -0.582f)
                arcTo(1.99f, 1.99f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -0.266f, -0.052f, -0.525f, -0.158f, -0.782f)
                close()
            }
        }
        .build()
        return _bxsTag!!
    }

private var _bxsTag: ImageVector? = null
