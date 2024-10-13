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

public val SolidGroup.BxsDirectionLeft: ImageVector
    get() {
        if (_bxsDirectionLeft != null) {
            return _bxsDirectionLeft!!
        }
        _bxsDirectionLeft = Builder(name = "BxsDirectionLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.707f, 11.294f)
                lineToRelative(-8.978f, -9.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, -1.415f, -0.002f)
                lineToRelative(-9.021f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.416f)
                lineToRelative(9.021f, 9.0f)
                curveToRelative(0.39f, 0.389f, 1.026f, 0.388f, 1.415f, -0.002f)
                lineToRelative(8.978f, -9.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.0f, -1.412f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _bxsDirectionLeft!!
    }

private var _bxsDirectionLeft: ImageVector? = null
