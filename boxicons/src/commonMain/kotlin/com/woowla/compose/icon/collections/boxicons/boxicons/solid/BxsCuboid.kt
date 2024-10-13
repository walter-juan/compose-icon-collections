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

public val SolidGroup.BxsCuboid: ImageVector
    get() {
        if (_bxsCuboid != null) {
            return _bxsCuboid!!
        }
        _bxsCuboid = Builder(name = "BxsCuboid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.707f, 2.293f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                curveToRelative(-0.414f, 0.0f, -0.785f, 0.255f, -0.934f, 0.641f)
                lineToRelative(-5.0f, 13.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 0.227f, 1.066f)
                lineToRelative(5.0f, 5.0f)
                arcTo(0.996f, 0.996f, 0.0f, false, false, 8.0f, 22.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.414f, 0.0f, 0.785f, -0.255f, 0.934f, -0.641f)
                lineToRelative(5.0f, -13.0f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -0.227f, -1.066f)
                lineToRelative(-5.0f, -5.0f)
                close()
                moveTo(18.585f, 7.0f)
                horizontalLineToRelative(-5.171f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(5.172f)
                lineToRelative(2.999f, 3.0f)
                close()
                moveTo(15.313f, 20.0f)
                horizontalLineToRelative(-6.23f)
                lineToRelative(4.583f, -11.0f)
                horizontalLineToRelative(5.878f)
                lineToRelative(-4.231f, 11.0f)
                close()
            }
        }
        .build()
        return _bxsCuboid!!
    }

private var _bxsCuboid: ImageVector? = null
