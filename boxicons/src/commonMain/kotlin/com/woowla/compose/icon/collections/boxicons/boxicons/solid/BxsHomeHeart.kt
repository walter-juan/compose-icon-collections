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

public val SolidGroup.BxsHomeHeart: ImageVector
    get() {
        if (_bxsHomeHeart != null) {
            return _bxsHomeHeart!!
        }
        _bxsHomeHeart = Builder(name = "BxsHomeHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.913f, -0.593f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.17f, -1.076f)
                lineToRelative(-9.0f, -10.0f)
                curveToRelative(-0.379f, -0.422f, -1.107f, -0.422f, -1.486f, 0.0f)
                lineToRelative(-9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 14.0f)
                close()
                moveTo(8.653f, 11.641f)
                arcToRelative(2.224f, 2.224f, 0.0f, false, true, 3.125f, 0.0f)
                lineToRelative(0.224f, 0.22f)
                lineToRelative(0.223f, -0.22f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 3.126f, 0.0f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 0.0f, 3.07f)
                lineTo(12.002f, 18.0f)
                lineToRelative(-3.349f, -3.289f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 0.0f, -3.07f)
                close()
            }
        }
        .build()
        return _bxsHomeHeart!!
    }

private var _bxsHomeHeart: ImageVector? = null
