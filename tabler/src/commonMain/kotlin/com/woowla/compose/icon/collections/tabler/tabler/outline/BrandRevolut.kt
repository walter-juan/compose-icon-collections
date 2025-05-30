package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.BrandRevolut: ImageVector
    get() {
        if (_brandRevolut != null) {
            return _brandRevolut!!
        }
        _brandRevolut = Builder(name = "BrandRevolut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 4.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-3.4f)
                verticalLineToRelative(4.0f)
                lineToRelative(4.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-5.0f, -7.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, -9.0f)
                close()
            }
        }
        .build()
        return _brandRevolut!!
    }

private var _brandRevolut: ImageVector? = null
