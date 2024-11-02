package com.woowla.compose.icon.collections.ionicons.ionicons.outline

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
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.CaretForwardCircle: ImageVector
    get() {
        if (_caretForwardCircle != null) {
            return _caretForwardCircle!!
        }
        _caretForwardCircle = Builder(name = "CaretForwardCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.23f, 342.43f)
                lineToRelative(89.09f, -74.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -24.6f)
                lineToRelative(-89.09f, -74.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 212.0f, 181.86f)
                verticalLineTo(330.14f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 238.23f, 342.43f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
        }
        .build()
        return _caretForwardCircle!!
    }

private var _caretForwardCircle: ImageVector? = null
