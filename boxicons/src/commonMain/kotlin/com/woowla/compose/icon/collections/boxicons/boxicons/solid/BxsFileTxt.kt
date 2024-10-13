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

public val SolidGroup.BxsFileTxt: ImageVector
    get() {
        if (_bxsFileTxt != null) {
            return _bxsFileTxt!!
        }
        _bxsFileTxt = Builder(name = "BxsFileTxt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(20.0f, 8.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(9.998f, 14.768f)
                lineTo(8.895f, 14.768f)
                verticalLineToRelative(3.274f)
                horizontalLineToRelative(-0.917f)
                verticalLineToRelative(-3.274f)
                lineTo(6.893f, 14.768f)
                lineTo(6.893f, 14.0f)
                horizontalLineToRelative(3.105f)
                verticalLineToRelative(0.768f)
                close()
                moveTo(12.723f, 18.042f)
                lineTo(12.358f, 17.311f)
                curveToRelative(-0.15f, -0.282f, -0.246f, -0.492f, -0.359f, -0.726f)
                horizontalLineToRelative(-0.013f)
                curveToRelative(-0.083f, 0.233f, -0.185f, 0.443f, -0.312f, 0.726f)
                lineToRelative(-0.335f, 0.731f)
                horizontalLineToRelative(-1.045f)
                lineToRelative(1.171f, -2.045f)
                lineTo(10.336f, 14.0f)
                horizontalLineToRelative(1.05f)
                lineToRelative(0.354f, 0.738f)
                curveToRelative(0.121f, 0.245f, 0.21f, 0.443f, 0.306f, 0.671f)
                horizontalLineToRelative(0.013f)
                curveToRelative(0.096f, -0.258f, 0.174f, -0.438f, 0.276f, -0.671f)
                lineToRelative(0.341f, -0.738f)
                horizontalLineToRelative(1.043f)
                lineToRelative(-1.139f, 1.973f)
                lineToRelative(1.198f, 2.069f)
                horizontalLineToRelative(-1.055f)
                close()
                moveTo(17.107f, 14.768f)
                horizontalLineToRelative(-1.104f)
                verticalLineToRelative(3.274f)
                horizontalLineToRelative(-0.917f)
                verticalLineToRelative(-3.274f)
                horizontalLineToRelative(-1.085f)
                lineTo(14.001f, 14.0f)
                horizontalLineToRelative(3.105f)
                verticalLineToRelative(0.768f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.0f, 4.0f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _bxsFileTxt!!
    }

private var _bxsFileTxt: ImageVector? = null
