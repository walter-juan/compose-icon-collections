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

public val SolidGroup.BxsBalloon: ImageVector
    get() {
        if (_bxsBalloon != null) {
            return _bxsBalloon!!
        }
        _bxsBalloon = Builder(name = "BxsBalloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.91f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-1.0f, -2.09f)
                curveToRelative(4.0f, -0.65f, 7.0f, -5.28f, 7.0f, -9.91f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                curveToRelative(0.0f, 4.63f, 3.08f, 9.26f, 7.0f, 9.91f)
                close()
                moveTo(12.0f, 4.25f)
                verticalLineToRelative(1.5f)
                arcTo(4.26f, 4.26f, 0.0f, false, false, 7.75f, 10.0f)
                horizontalLineToRelative(-1.5f)
                arcTo(5.76f, 5.76f, 0.0f, false, true, 12.0f, 4.25f)
                close()
            }
        }
        .build()
        return _bxsBalloon!!
    }

private var _bxsBalloon: ImageVector? = null
