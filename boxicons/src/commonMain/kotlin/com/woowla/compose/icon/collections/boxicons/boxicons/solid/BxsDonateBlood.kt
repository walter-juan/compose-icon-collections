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

public val SolidGroup.BxsDonateBlood: ImageVector
    get() {
        if (_bxsDonateBlood != null) {
            return _bxsDonateBlood!!
        }
        _bxsDonateBlood = Builder(name = "BxsDonateBlood", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.726f, 13.02f)
                lineTo(14.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.065f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.416f, -0.777f)
                lineToRelative(-0.888f, -1.332f)
                arcTo(1.995f, 1.995f, 0.0f, false, false, 10.93f, 12.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(9.639f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.258f, -1.024f)
                lineTo(22.0f, 13.0f)
                lineToRelative(-1.452f, -0.484f)
                arcToRelative(2.998f, 2.998f, 0.0f, false, false, -2.822f, 0.504f)
                close()
                moveTo(15.403f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                curveToRelative(0.0f, -2.708f, -3.0f, -6.0f, -3.0f, -6.0f)
                reflectiveCurveToRelative(-3.0f, 3.271f, -3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _bxsDonateBlood!!
    }

private var _bxsDonateBlood: ImageVector? = null
