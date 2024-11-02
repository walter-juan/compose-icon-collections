package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 6.087f)
                curveTo(14.25f, 5.732f, 14.436f, 5.411f, 14.651f, 5.128f)
                curveTo(14.872f, 4.838f, 15.0f, 4.494f, 15.0f, 4.125f)
                curveTo(15.0f, 3.089f, 13.993f, 2.25f, 12.75f, 2.25f)
                curveTo(11.507f, 2.25f, 10.5f, 3.089f, 10.5f, 4.125f)
                curveTo(10.5f, 4.494f, 10.628f, 4.838f, 10.849f, 5.128f)
                curveTo(11.064f, 5.411f, 11.25f, 5.732f, 11.25f, 6.087f)
                verticalLineTo(6.087f)
                curveTo(11.25f, 6.448f, 10.954f, 6.74f, 10.593f, 6.73f)
                curveTo(9.189f, 6.689f, 7.801f, 6.588f, 6.43f, 6.43f)
                curveTo(6.616f, 8.043f, 6.723f, 9.68f, 6.745f, 11.337f)
                curveTo(6.75f, 11.703f, 6.453f, 12.0f, 6.087f, 12.0f)
                verticalLineTo(12.0f)
                curveTo(5.732f, 12.0f, 5.411f, 11.814f, 5.128f, 11.599f)
                curveTo(4.838f, 11.378f, 4.494f, 11.25f, 4.125f, 11.25f)
                curveTo(3.089f, 11.25f, 2.25f, 12.257f, 2.25f, 13.5f)
                curveTo(2.25f, 14.743f, 3.089f, 15.75f, 4.125f, 15.75f)
                curveTo(4.494f, 15.75f, 4.838f, 15.622f, 5.128f, 15.401f)
                curveTo(5.411f, 15.186f, 5.732f, 15.0f, 6.087f, 15.0f)
                verticalLineTo(15.0f)
                curveTo(6.396f, 15.0f, 6.642f, 15.261f, 6.619f, 15.569f)
                curveTo(6.493f, 17.281f, 6.277f, 18.968f, 5.977f, 20.626f)
                curveTo(7.495f, 20.816f, 9.035f, 20.935f, 10.593f, 20.98f)
                curveTo(10.954f, 20.99f, 11.25f, 20.698f, 11.25f, 20.337f)
                verticalLineTo(20.337f)
                curveTo(11.25f, 19.982f, 11.064f, 19.661f, 10.849f, 19.378f)
                curveTo(10.628f, 19.088f, 10.5f, 18.744f, 10.5f, 18.375f)
                curveTo(10.5f, 17.34f, 11.507f, 16.5f, 12.75f, 16.5f)
                curveTo(13.993f, 16.5f, 15.0f, 17.34f, 15.0f, 18.375f)
                curveTo(15.0f, 18.744f, 14.872f, 19.088f, 14.651f, 19.378f)
                curveTo(14.436f, 19.661f, 14.25f, 19.982f, 14.25f, 20.337f)
                verticalLineTo(20.337f)
                curveTo(14.25f, 20.67f, 14.528f, 20.936f, 14.861f, 20.916f)
                curveTo(16.699f, 20.808f, 18.51f, 20.597f, 20.288f, 20.287f)
                curveTo(20.557f, 18.739f, 20.752f, 17.165f, 20.87f, 15.57f)
                curveTo(20.892f, 15.261f, 20.647f, 15.0f, 20.337f, 15.0f)
                verticalLineTo(15.0f)
                curveTo(19.982f, 15.0f, 19.661f, 15.186f, 19.378f, 15.401f)
                curveTo(19.088f, 15.622f, 18.744f, 15.75f, 18.375f, 15.75f)
                curveTo(17.34f, 15.75f, 16.5f, 14.743f, 16.5f, 13.5f)
                curveTo(16.5f, 12.257f, 17.34f, 11.25f, 18.375f, 11.25f)
                curveTo(18.744f, 11.25f, 19.088f, 11.378f, 19.378f, 11.599f)
                curveTo(19.661f, 11.814f, 19.982f, 12.0f, 20.337f, 12.0f)
                verticalLineTo(12.0f)
                curveTo(20.703f, 12.0f, 21.001f, 11.703f, 20.996f, 11.337f)
                curveTo(20.971f, 9.524f, 20.846f, 7.736f, 20.626f, 5.977f)
                curveTo(18.74f, 6.319f, 16.816f, 6.551f, 14.86f, 6.666f)
                curveTo(14.528f, 6.686f, 14.25f, 6.42f, 14.25f, 6.087f)
                verticalLineTo(6.087f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
