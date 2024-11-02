package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ShieldExclamation: ImageVector
    get() {
        if (_shieldExclamation != null) {
            return _shieldExclamation!!
        }
        _shieldExclamation = Builder(name = "ShieldExclamation", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.484f, 2.17f)
                curveTo(11.774f, 1.896f, 12.226f, 1.896f, 12.516f, 2.17f)
                curveTo(14.533f, 4.08f, 17.254f, 5.25f, 20.25f, 5.25f)
                curveTo(20.298f, 5.25f, 20.345f, 5.25f, 20.393f, 5.249f)
                curveTo(20.72f, 5.245f, 21.012f, 5.454f, 21.115f, 5.765f)
                curveTo(21.527f, 7.02f, 21.75f, 8.36f, 21.75f, 9.75f)
                curveTo(21.75f, 15.692f, 17.686f, 20.683f, 12.187f, 22.098f)
                curveTo(12.064f, 22.13f, 11.936f, 22.13f, 11.813f, 22.098f)
                curveTo(6.314f, 20.683f, 2.25f, 15.692f, 2.25f, 9.75f)
                curveTo(2.25f, 8.36f, 2.473f, 7.02f, 2.885f, 5.765f)
                curveTo(2.988f, 5.454f, 3.28f, 5.245f, 3.607f, 5.249f)
                curveTo(3.655f, 5.25f, 3.702f, 5.25f, 3.75f, 5.25f)
                curveTo(6.746f, 5.25f, 9.468f, 4.08f, 11.484f, 2.17f)
                close()
                moveTo(12.0f, 8.25f)
                curveTo(12.414f, 8.25f, 12.75f, 8.586f, 12.75f, 9.0f)
                verticalLineTo(12.75f)
                curveTo(12.75f, 13.164f, 12.414f, 13.5f, 12.0f, 13.5f)
                curveTo(11.586f, 13.5f, 11.25f, 13.164f, 11.25f, 12.75f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.586f, 11.586f, 8.25f, 12.0f, 8.25f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(11.586f, 15.0f, 11.25f, 15.336f, 11.25f, 15.75f)
                verticalLineTo(15.757f)
                curveTo(11.25f, 16.172f, 11.586f, 16.507f, 12.0f, 16.507f)
                horizontalLineTo(12.007f)
                curveTo(12.422f, 16.507f, 12.757f, 16.172f, 12.757f, 15.757f)
                verticalLineTo(15.75f)
                curveTo(12.757f, 15.336f, 12.422f, 15.0f, 12.007f, 15.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _shieldExclamation!!
    }

private var _shieldExclamation: ImageVector? = null
