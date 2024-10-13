package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDailymotion: ImageVector
    get() {
        if (_bxlDailymotion != null) {
            return _bxlDailymotion!!
        }
        _bxlDailymotion = Builder(name = "BxlDailymotion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.551f, 11.485f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, false, -2.328f, 2.332f)
                curveToRelative(0.0f, 1.314f, 1.013f, 2.313f, 2.441f, 2.313f)
                lineToRelative(-0.012f, 0.002f)
                curveToRelative(1.192f, 0.0f, 2.193f, -0.983f, 2.193f, -2.28f)
                curveToRelative(0.001f, -1.349f, -1.001f, -2.367f, -2.294f, -2.367f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(18.52f, 18.605f)
                horizontalLineToRelative(-2.682f)
                verticalLineToRelative(-1.058f)
                curveToRelative(-0.825f, 0.81f, -1.667f, 1.103f, -2.786f, 1.103f)
                curveToRelative(-1.142f, 0.0f, -2.124f, -0.371f, -2.947f, -1.114f)
                curveToRelative(-1.086f, -0.956f, -1.648f, -2.227f, -1.648f, -3.701f)
                curveToRelative(0.0f, -1.351f, 0.524f, -2.561f, 1.507f, -3.506f)
                curveToRelative(0.878f, -0.859f, 1.946f, -1.298f, 3.139f, -1.298f)
                curveToRelative(1.14f, 0.0f, 2.018f, 0.385f, 2.647f, 1.192f)
                lineTo(15.75f, 6.118f)
                lineToRelative(2.77f, -0.574f)
                verticalLineToRelative(-0.002f)
                lineToRelative(0.002f, 0.003f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(13.06f)
                close()
            }
        }
        .build()
        return _bxlDailymotion!!
    }

private var _bxlDailymotion: ImageVector? = null
