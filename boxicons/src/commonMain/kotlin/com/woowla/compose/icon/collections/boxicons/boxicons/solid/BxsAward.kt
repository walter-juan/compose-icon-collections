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

public val SolidGroup.BxsAward: ImageVector
    get() {
        if (_bxsAward != null) {
            return _bxsAward!!
        }
        _bxsAward = Builder(name = "BxsAward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.999f)
                arcToRelative(6.99f, 6.99f, 0.0f, false, false, 2.879f, 5.646f)
                lineToRelative(0.001f, 0.001f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, false, 1.881f, 0.979f)
                lineToRelative(0.051f, 0.019f)
                arcToRelative(6.906f, 6.906f, 0.0f, false, false, 1.163f, 0.271f)
                arcToRelative(6.79f, 6.79f, 0.0f, false, false, 1.024f, 0.085f)
                horizontalLineTo(12.0f)
                curveToRelative(0.35f, 0.0f, 0.69f, -0.034f, 1.027f, -0.084f)
                lineToRelative(0.182f, -0.028f)
                curveToRelative(0.336f, -0.059f, 0.664f, -0.139f, 0.981f, -0.243f)
                lineToRelative(0.042f, -0.016f)
                curveTo(17.0f, 14.693f, 19.0f, 12.078f, 19.0f, 8.999f)
                curveTo(19.0f, 5.14f, 15.86f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(5.0f, 5.14f, 5.0f, 8.999f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(2.756f, 0.0f, 5.0f, 2.242f, 5.0f, 4.999f)
                horizontalLineToRelative(-2.0f)
                arcTo(3.003f, 3.003f, 0.0f, false, false, 12.0f, 6.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.521f, 16.795f)
                verticalLineTo(22.0f)
                lineTo(12.0f, 20.5f)
                lineToRelative(4.479f, 1.5f)
                lineToRelative(0.001f, -5.205f)
                arcToRelative(8.932f, 8.932f, 0.0f, false, true, -8.959f, 0.0f)
                close()
            }
        }
        .build()
        return _bxsAward!!
    }

private var _bxsAward: ImageVector? = null
